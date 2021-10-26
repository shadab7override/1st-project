/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Seller {
    @Id
    private Long userId;
    private Double gst;
    private String companyContact;
    private String companyName;

    @OneToOne
    @JoinColumn(name="userId")
    private User user;

 */
/*
  @ManyToMany
    @JoinColumn(name="id")
    private Set<Product> products;

    *//*


    public Seller( Double gst, String companyContact, String companyName) {

        this.gst = gst;
        this.companyContact = companyContact;
        this.companyName = companyName;
    }



    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
*/
