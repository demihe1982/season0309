package edu.ldcollege.domain;

public class LdStudent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_student.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_student.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_student.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_student.id
     *
     * @return the value of ld_student.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_student.id
     *
     * @param id the value for ld_student.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_student.name
     *
     * @return the value of ld_student.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_student.name
     *
     * @param name the value for ld_student.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_student.password
     *
     * @return the value of ld_student.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_student.password
     *
     * @param password the value for ld_student.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }
}