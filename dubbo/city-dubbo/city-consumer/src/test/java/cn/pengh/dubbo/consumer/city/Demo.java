package cn.pengh.dubbo.consumer.city;

import com.alibaba.dubbo.rpc.RpcContext;

import cn.pengh.dubbo.api.city.CityRequest;
import cn.pengh.dubbo.api.city.CityService;
import cn.pengh.dubbo.api.phone.PhoneBinRequest;
import cn.pengh.dubbo.api.phone.PhoneBinService;
import cn.pengh.dubbo.consumer.city.helper.RegisterHelper;
import cn.pengh.helper.ClazzHelper;
import cn.pengh.library.Log;
import cn.pengh.mvc.core.listener.AppCtxKeeper;

public class Demo {
	
	public static void main(String[] args) {
		//测试常规服务
		RegisterHelper.init();
        CityService cityService = AppCtxKeeper.getBean(CityService.class);
        
        Log.debug(RpcContext.getContext().isConsumerSide());
        
        ClazzHelper.print(cityService.get(new CityRequest(110)));//
        ClazzHelper.print(cityService.get(new CityRequest(36)));//360000 江西省
        ClazzHelper.print(cityService.get(new CityRequest(3607)));//360700 江西省赣州市
        ClazzHelper.print(cityService.get(new CityRequest(360782)));
        ClazzHelper.print(cityService.get(new CityRequest(310115)));//310115 上海市上海市浦东新区
        ClazzHelper.print(cityService.get(new CityRequest(330101)));//杭州
        
        Log.debug(RpcContext.getContext().isConsumerSide());
        
        
        PhoneBinService phoneBinService = AppCtxKeeper.getBean(PhoneBinService.class);
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("010")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("0527")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("1868201")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("1868201XXXX")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("1709183")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("1730169")));//
        ClazzHelper.print(phoneBinService.get(new PhoneBinRequest("1314847")));//
	}
}
