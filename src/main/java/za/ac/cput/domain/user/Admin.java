package za.ac.cput.domain.user;

import java.util.Objects;

public class Admin {


    private String fname,lname,email;

    private Admin(){}

    private Admin(Builder builder)
    {
        this.email =builder.email;
        this.fname =builder.fname;
        this.lname =builder.lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String fname,lname,email;

        public  Builder setFname(String fname)
        {
            this.fname =fname;
            return this;
        }
        public Builder setLname(String lname)
        {
            this.lname =lname;
            return this;
        }

        public Builder setEmail(String email)
        {
            this.email =email;
            return this;
        }

        public Builder copy(Admin admin)
        {
            this.email =admin.email;
            this.lname = admin.lname;
            this.fname =admin.fname;
            return this;
        }

        public Admin build()
        {
            return new Admin(this);
        }


        public String getFname() {
            return fname;
        }

        public String getLname() {
            return lname;
        }

        public String getEmail() {
            return email;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(fname, admin.fname) &&
                Objects.equals(lname, admin.lname) &&
                email.equals(admin.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash( email);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
