package com.hui.atcrowdfunding.bean;

public class Dictionary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.name
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.code
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.subcode
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private String subcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionary.val
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private String val;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.id
     *
     * @return the value of t_dictionary.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.id
     *
     * @param id the value for t_dictionary.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.name
     *
     * @return the value of t_dictionary.name
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.name
     *
     * @param name the value for t_dictionary.name
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.code
     *
     * @return the value of t_dictionary.code
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.code
     *
     * @param code the value for t_dictionary.code
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.subcode
     *
     * @return the value of t_dictionary.subcode
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public String getSubcode() {
        return subcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.subcode
     *
     * @param subcode the value for t_dictionary.subcode
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setSubcode(String subcode) {
        this.subcode = subcode == null ? null : subcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionary.val
     *
     * @return the value of t_dictionary.val
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public String getVal() {
        return val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dictionary.val
     *
     * @param val the value for t_dictionary.val
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }
}