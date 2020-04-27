package com.devfun.service;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.devfun.dao.WineQualityDAO;
import com.devfun.vo.WineQualityVO;
 
@Service
public class WineQualityServiceImpl implements WineQualityService {
 
    @Inject
    private WineQualityDAO dao;
    
    @Override
    public List<WineQualityVO> selectWineQuality() throws Exception {
 
        return dao.selectWineQuality();
    }
    
    @Override
    public List<WineQualityVO> selectWineQuality2() throws Exception {
 
        return dao.selectWineQuality2();
    }
}