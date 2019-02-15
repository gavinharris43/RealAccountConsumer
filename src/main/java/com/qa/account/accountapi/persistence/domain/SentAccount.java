package com.qa.account.accountapi.persistence.domain;

public class SentAccount {

    private Long accountId;

    private String firstName;

    private String lastName;
    private String email;
    
    private String password;
    private String accountNumber;
    private SentCohort sentCohort;

    private SentPrize sentPrize;
   

    

      public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public SentAccount() {
    }

    public SentAccount(Long accountId, String firstName, String lastName, String accountNumber,String email,String password,SentCohort sentCohort, SentPrize sentPrize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.accountId = accountId;
        this.email=email;
        this.password=password;
        this.sentCohort = sentCohort;
        this.sentPrize = sentPrize;
    }

    public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public SentCohort getSentCohotr() {
		return sentCohort;
	}

	public void setSentCohotr(SentCohort sentCohotr) {
		this.sentCohort = sentCohotr;
	}

	public Long getId() {
        return accountId;
    }

    public void setId(Long id) {
        this.accountId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SentPrize getSentPrize() {
        return sentPrize;
    }

    public void setSentPrize(SentPrize sentPrize) {
        this.sentPrize = sentPrize;
    }

}