package com.szmirren.vxApi.spi.handler;

import java.util.ArrayList;
import java.util.List;

import com.szmirren.vxApi.core.common.StrUtil;
import com.szmirren.vxApi.core.entity.VxApis;

import io.vertx.core.http.HttpClient;
import io.vertx.core.json.JsonObject;

/**
 * 
 * @author <a href="http://szmirren.com">Mirren</a>
 *
 */
public class VxApiAfterHandlerFactory {

	/**
	 * 获得所有实现类名字
	 * 
	 * @return
	 */
	public static List<String> getImplNames() {
		List<String> result = new ArrayList<>();
		// result.add(TEST_SIMPLE);
		return result;
	}

	/**
	 * 获得后置处理器
	 * 
	 * @param name
	 * @param options
	 * @return
	 * @throws NullPointerException
	 * @throws ClassNotFoundException
	 */
	public static VxApiAfterHandler getAfterHandler(String name, JsonObject options, VxApis api, HttpClient httpClient)
			throws NullPointerException, ClassNotFoundException {
		if (StrUtil.isNullOrEmpty(name)) {
			throw new NullPointerException("获取后置处理器实现-->失败:工厂名字不能为空");
		}
		// if (TEST_SIMPLE.equalsIgnoreCase(name)) {
		// return new TestAfterHandlerSimple(api);
		// }
		throw new ClassNotFoundException("没有找到名字为 : " + name + " 的后置处理器实现类");
	}

}
