package com.devfun.dao;

import java.util.List;

import com.devfun.vo.WineQualityVO;

public interface WineQualityDAO {
	public List<WineQualityVO> selectWineQuality() throws Exception;
	public List<WineQualityVO> selectWineQuality2() throws Exception;
}
