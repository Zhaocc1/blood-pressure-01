package com.trtjk.bloodpressure.mapper;

import com.trtjk.bloodpressure.bean.BloodData;
import com.trtjk.bloodpressure.bean.BloodDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BloodDataMapper {
    int countByExample(BloodDataExample example);

    int deleteByExample(BloodDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BloodData record);

    int insertSelective(BloodData record);

    List<BloodData> selectByExample(BloodDataExample example);

    BloodData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BloodData record, @Param("example") BloodDataExample example);

    int updateByExample(@Param("record") BloodData record, @Param("example") BloodDataExample example);

    int updateByPrimaryKeySelective(BloodData record);

    int updateByPrimaryKey(BloodData record);
}