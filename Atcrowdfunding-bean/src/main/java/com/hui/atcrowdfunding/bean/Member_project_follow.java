package com.hui.atcrowdfunding.bean;

public class Member_project_follow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.projectid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.memberid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    private Integer memberid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.id
     *
     * @return the value of t_member_project_follow.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.id
     *
     * @param id the value for t_member_project_follow.id
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.projectid
     *
     * @return the value of t_member_project_follow.projectid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.projectid
     *
     * @param projectid the value for t_member_project_follow.projectid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.memberid
     *
     * @return the value of t_member_project_follow.memberid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.memberid
     *
     * @param memberid the value for t_member_project_follow.memberid
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
}