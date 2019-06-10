package com.trtjk.bloodpressure.controller;


import com.trtjk.bloodpressure.bean.BloodData;
import com.trtjk.bloodpressure.bean.ResponseMessage;
import com.trtjk.bloodpressure.mapper.BloodDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("trtjk/bloodpressure/")
@RestController
@RequestMapping("trtjk/")
public class BloodPressureController {

    @Autowired
    private BloodDataMapper bloodDataMapper;

    @PostMapping(value = "receiveData/{bloodData}")
    public ResponseMessage receiveData(@PathVariable ("bloodData")BloodData bloodData){

        //插入数据
        int responseCode = bloodDataMapper.insertSelective(bloodData);

        int code = 1;
        String status = "success";
        String msg = "数据已保存";

        //接收数据失败
        if (responseCode != 1){

            code = 0;
            status = "fail";
            msg = "数据保存失败";

        }

        ResponseMessage responseMessage =new ResponseMessage(code,status,msg,null);

        return responseMessage;
    }

    @RequestMapping(value = "/getData")
    public BloodData getData(){
        BloodData bloodData = bloodDataMapper.selectByPrimaryKey(1l);
        return bloodData;
    }

}
