package com.hui.atcrowdfunding.manage.dao;

import com.hui.atcrowdfunding.bean.Project_type;
import com.hui.atcrowdfunding.bean.Project_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Project_typeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    long countByExample(Project_typeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByExample(Project_typeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insert(Project_type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insertSelective(Project_type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    List<Project_type> selectByExample(Project_typeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    Project_type selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Project_type record, @Param("example") Project_typeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExample(@Param("record") Project_type record, @Param("example") Project_typeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKeySelective(Project_type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_type
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKey(Project_type record);
}