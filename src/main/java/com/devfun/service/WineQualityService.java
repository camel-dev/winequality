package com.devfun.service;
import java.util.List;
import com.devfun.vo.WineQualityVO;;

public interface WineQualityService {
	List<WineQualityVO> selectWineQuality() throws Exception;
	List<WineQualityVO> selectWineQuality2() throws Exception;
}
