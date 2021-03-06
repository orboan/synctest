/*
 * Person.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.HashSet;
import org.joda.time.DateTime;

/**
 * Modelizes a person
 */
public class Person {

    // Fields
    /** Person's DNI */
    private int dni;
    /** Person's name */
    private String name;
    /** Contracts of the person */
    private HashSet<Contract> contracts;

    // Constructors
    /**
     * Constructor by default.
     */
    public Person() {
        this.dni = 123456;
        this.name = "Pere Queralt";
        this.contracts = new HashSet<Contract>();
    }

    /**
     * Constructor.
     * 
     * @param dni a dni
     */
    public Person(int dni) {
        this.dni = dni;
        this.contracts = new HashSet<Contract>();
    }

    /**
     * Constructor.
     * 
     * @param dni a dni
     * @param name a name
     */
    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name.trim();
        this.contracts = new HashSet<Contract>();
    }

    /**
     * Calculates the total duration of all contracts.
     * 
     * @return number of days of all contracts.
     */
    public int workedTime() {
        int wd = 0; // Worked days
        for (Contract contract : this.contracts) {
            wd += contract.duration();
        }
        return wd;
    }

    /**
     * Calculates in how many companies the person has worked for.
     * 
     * @return the number of companies.
     */
    public int nCompanies() {
//        HashSet<Integer> companiesCIF = new HashSet<Integer>();
//        for (Contract contract : this.contracts) {
//            Company company = contract.getCompany();
//            companiesCIF.add(company.getCif());
//        }
//        int ne = companiesCIF.size();
//        return ne;
        
        HashSet<Company> companies = new HashSet<Company>();
        for (Contract contract : this.contracts) {
            Company company = contract.getCompany();
            companies.add(company);
        }
        int ne = companies.size();
        return ne;
    }

    /**
     * Sign a contract.
     * 
     * @param contract the contract to be signed.
     * @return true if the contract is signed, false otherwise
     */
    public boolean signContract(Contract contract) {
        DateTime contractInitialDate = JodaDT.parseDDMMYYYY(contract.getInitialDate());
        DateTime contractEndDate = JodaDT.parseDDMMYYYY(contract.getEndDate());
        // Traverse all contracts to find out if -contract- can be signed
        for (Contract signedContract : this.contracts) {
            // Initial date of current contract
            DateTime initialDateSignedContract = JodaDT.parseDDMMYYYY(signedContract
                    .getInitialDate());
            // End date of current contract
            DateTime endDateSignedContract = JodaDT.parseDDMMYYYY(signedContract.getEndDate());
            // Find out if the company is the same
            boolean cond1 = contract.getCompany().equals(signedContract.getCompany());
            // Find out if both contracts have the same initial date
            boolean cond2 = (signedContract.getInitialDate()).equals(contract.getInitialDate());
            // Find out if the initial date of the contract is inside the period
            // of the current signed contract
            boolean cond3 = JodaDT.isInInterval(contractInitialDate,
                                                initialDateSignedContract,
                                                endDateSignedContract);
            // Find out if the initial date of the current signed contract is
            // inside the period of the contract
            boolean cond4 = JodaDT.isInInterval(initialDateSignedContract,
                                                contractInitialDate,
                                                contractEndDate);
            boolean cond = cond1 && (cond2 || cond3 || cond4);
            if (cond) {
                return false;
            }
        } // Loop end
        // Sign the contract
        return contracts.add(contract); // Sign contract
    }

    // Equals & hashCode
    // Two persons are equals if they have the same dni

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (dni != other.dni)
            return false;
        return true;
    }
}
