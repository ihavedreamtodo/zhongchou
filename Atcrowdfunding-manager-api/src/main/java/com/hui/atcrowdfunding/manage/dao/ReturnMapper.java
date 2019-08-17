package com.hui.atcrowdfunding.manage.dao;

import com.hui.atcrowdfunding.bean.Return;
import com.hui.atcrowdfunding.bean.ReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    long countByExample(ReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByExample(ReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insert(Return record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insertSelective(Return record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    List<Return> selectByExample(ReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    Return selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Return record, @Param("example") ReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExample(@Param("record") Return record, @Param("example") ReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKeySelective(Return record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKey(Return record);
}