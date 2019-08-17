package com.hui.atcrowdfunding.manage.dao;

import com.hui.atcrowdfunding.bean.Dictionary;
import com.hui.atcrowdfunding.bean.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    long countByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int insertSelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    List<Dictionary> selectByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    Dictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary
     *
     * @mbg.generated Sat Aug 17 10:59:59 CST 2019
     */
    int updateByPrimaryKey(Dictionary record);
}