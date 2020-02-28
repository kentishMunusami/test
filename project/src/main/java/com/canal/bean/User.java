package com.canal.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "user")
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;

    @Column(name = "usr_username", length = 50, unique = true)
    private String username;

    @Column(name = "usr_password", length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    @Column(name = "usr_firstname", length = 50)
    @NotNull
    private String firstname;

    @Column(name = "usr_lastname", length = 50)
    @NotNull
    private String lastname;

    @Column(name = "usr_email", length = 50)
    @NotNull
    private String email;

    @Column(name = "usr_enabled")
    @NotNull
    private Boolean enabled;

    @Column(name = "id_salesforce", unique = true)
    private String idSalesForce;

    @Column(name = "usr_last_password_reset_date")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastPasswordResetDate;
    
    @Column(name = "usr_reset_pwd_key", length = 255)
    private String resetPasswordKey;
    
    @Column(name = "usr_reset_pwd_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resetPasswordTimestamp;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "usr_id", referencedColumnName = "usr_id")},
            inverseJoinColumns = {@JoinColumn(name = "auth_id", referencedColumnName = "auth_id")})
    private List<Authority> authorities;
}
