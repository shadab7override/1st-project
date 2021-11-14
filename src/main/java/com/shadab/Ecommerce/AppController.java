package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private UserRepository repo;

    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;

    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    StudentServices service;
    @RequestMapping("/a")
    public String viewHomePage(Model model) {
        List<Student> listStudent = service.listAll();
        model.addAttribute("listStudent",listStudent);
        return "index2";
    }

    @RequestMapping("/new")
    public String newStudentPage(Model model) {
        Student student=new Student();
        model.addAttribute(student);
        return "new_student";
    }

    @RequestMapping(value = "/save", method =RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student ) {
        service.save(student);
        return "redirect:/";
    }
    @RequestMapping("/edit/{sid}")
    public ModelAndView showEditStudentPage(@PathVariable (name="sid") Long sid) {
        ModelAndView mav=new ModelAndView("edit_student");
        Student student=service.get(sid);
        mav.addObject("student",student);
        return mav;
    }

    @RequestMapping("/delete/{sid}")
    public String deleteStudentPage(@PathVariable (name="sid") Long sid) {
        service.delete(sid);
        return "redirect:/";
    }


    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }


   /* @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "register_success";

    }*/

    @GetMapping("/list_users")
    public String viewUserList(Model model) {
        List<User> listUser = repo.findAll();
        model.addAttribute("listUser", listUser);

        return "users";
    }




    // Function to display login page
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public ModelAndView displayLogin(ModelAndView modelAndView, User user) {
        modelAndView.addObject("user", user);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    // Function to handle the login process
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView loginUser(ModelAndView modelAndView, User user) {
        // Right before saving the user on registration, we encode the password
       /* BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);*/

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
      /*  String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);*/

        User existingUser = repo.findByEmail(user.getEmail());
        if (existingUser != null) {
            // Use encoder.matches to compare raw password with encrypted password

            if (encoder.matches(user.getPassword(), existingUser.getPassword())){
                // Successfully logged in
                modelAndView.addObject("message", "Successfully logged in!");
                modelAndView.setViewName("successLogin");
            } else {
                // Wrong password
                modelAndView.addObject("message", "Incorrect password. Try again.");
                modelAndView.setViewName("login");
            }
        } else {
            modelAndView.addObject("message", "The email provided does not exist!");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
    // Display the form
    @RequestMapping(value="/forgot-password", method=RequestMethod.GET)
    public ModelAndView displayResetPassword(ModelAndView modelAndView, User user) {
        modelAndView.addObject("user", user);
        modelAndView.setViewName("forgotPassword");
        return modelAndView;
    }

    // Receive the address and send an email
    @RequestMapping(value="/forgot-password", method=RequestMethod.POST)
    public ModelAndView forgotUserPassword(ModelAndView modelAndView, User user) {
        User existingUser = repo.findByEmail(user.getEmail());
        if (existingUser != null) {
            // Create token
            ConfirmationToken confirmationToken = new ConfirmationToken(existingUser);

            // Save it
            confirmationTokenRepository.save(confirmationToken);

            // Create the email
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(existingUser.getEmail());
            mailMessage.setSubject("Complete Password Reset!");
            mailMessage.setFrom("test-email@gmail.com");
            mailMessage.setText("To complete the password reset process, please click here: "
                    + "http://localhost:8082/confirm-reset?token="+confirmationToken.getConfirmationToken());

            // Send the email
            emailSenderService.sendEmail(mailMessage);

            modelAndView.addObject("message", "Request to reset password received. Check your inbox for the reset link.");
            modelAndView.setViewName("successForgotPassword");

        } else {
            modelAndView.addObject("message", "This email address does not exist!");
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

    // Endpoint to confirm the token
    @RequestMapping(value="/confirm-reset", method= {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView validateResetToken(ModelAndView modelAndView, @RequestParam("token")String confirmationToken) {
        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

        if (token != null) {
            User user = repo.findByEmail(token.getUser().getEmail());
            user.setEnabled(true);
            repo.save(user);
            modelAndView.addObject("user", user);
            modelAndView.addObject("emailId", user.getEmail());
            modelAndView.setViewName("resetPassword");
        } else {
            modelAndView.addObject("message", "The link is invalid or broken!");
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

    // Endpoint to update a user's password
    @RequestMapping(value = "/reset-password", method = RequestMethod.POST)
    public ModelAndView resetUserPassword(ModelAndView modelAndView, User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        //System.out.println(encoder);

        // Right before saving the user on registration, we encode the password
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        if (user.getEmail() != null) {
            // Use email to find user
            User tokenUser = repo.findByEmail(user.getEmail());
            tokenUser.setPassword(encoder.encode(user.getPassword()));
            repo.save(tokenUser);
            modelAndView.addObject("message", "Password successfully reset. You can now log in with the new credentials.");
            modelAndView.setViewName("successResetPassword");
        } else {
            modelAndView.addObject("message","The link is invalid or broken!");
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }




    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ModelAndView registerUser(ModelAndView modelAndView, User user)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        //repo.save(user);

        User existingUser = repo.findByEmail(user.getEmail());
        if(existingUser != null)
        {
            modelAndView.addObject("message","This email already exists!");
            modelAndView.setViewName("error");
        }
        else
        {
            repo.save(user);

            ConfirmationToken confirmationToken = new ConfirmationToken(user);

            confirmationTokenRepository.save(confirmationToken);

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(user.getEmail());
            mailMessage.setSubject("Complete Registration!");
            mailMessage.setFrom("uccshadab7@gmail.com");
            mailMessage.setText("To confirm your account, please click here : "
                    +"http://localhost:8082/confirm-account?token="+confirmationToken.getConfirmationToken());

            emailSenderService.sendEmail(mailMessage);

            modelAndView.addObject("email", user.getEmail());

            modelAndView.setViewName("successfulRegisteration");
        }

        return modelAndView;
    }

    @RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView confirmUserAccount(ModelAndView modelAndView, @RequestParam("token")String confirmationToken)
    {
        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

        if(token != null)
        {
           User user = repo.findByEmail(token.getUser().getEmail());
            user.setEnabled(true);
            repo.save(user);
           // repo.activateUser("shadab.shiekh@tothenew.com");
            modelAndView.setViewName("accountVerified");

        }
        else
        {
            modelAndView.addObject("message","The link is invalid or broken!");
            modelAndView.setViewName("error");
        }

        return modelAndView;
    }
    // getters and setters

    public UserRepository getRepo() {
        return repo;
    }

    public void setRepo(UserRepository repo) {
        this.repo = repo;
    }

    public ConfirmationTokenRepository getConfirmationTokenRepository() {
        return confirmationTokenRepository;
    }

    public void setConfirmationTokenRepository(ConfirmationTokenRepository confirmationTokenRepository) {
        this.confirmationTokenRepository = confirmationTokenRepository;
    }

    public EmailSenderService getEmailSenderService() {
        return emailSenderService;
    }

    public void setEmailSenderService(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }
}

