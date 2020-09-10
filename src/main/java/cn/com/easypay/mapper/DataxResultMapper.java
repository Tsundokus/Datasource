package cn.com.easypay.mapper;

import cn.com.easypay.mapper.DataxResult;
import cn.com.easypay.mapper.DataxResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataxResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int countByExample(DataxResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int deleteByExample(DataxResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int insert(DataxResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int insertSelective(DataxResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    List<DataxResult> selectByExample(DataxResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    DataxResult selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") DataxResult record, @Param("example") DataxResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int updateByExample(@Param("record") DataxResult record, @Param("example") DataxResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int updateByPrimaryKeySelective(DataxResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAX_RESULT
     *
     * @mbggenerated Fri Aug 21 13:38:38 CST 2020
     */
    int updateByPrimaryKey(DataxResult record);
}