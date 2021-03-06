package com.hui.atcrowdfunding.manage.dao;

import com.hui.atcrowdfunding.bean.Account_type_cert;
import com.hui.atcrowdfunding.bean.Account_type_certExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Account_type_certMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    long countByExample(Account_type_certExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByExample(Account_type_certExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insert(Account_type_cert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insertSelective(Account_type_cert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    List<Account_type_cert> selectByExample(Account_type_certExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    Account_type_cert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Account_type_cert record, @Param("example") Account_type_certExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExample(@Param("record") Account_type_cert record, @Param("example") Account_type_certExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKeySelective(Account_type_cert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_type_cert
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKey(Account_type_cert record);
}