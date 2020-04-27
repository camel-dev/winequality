package com.devfun.springchart;

import java.util.List;

import javax.inject.Inject;

import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfun.service.WineQualityService;
import com.devfun.vo.WineQualityVO;
@RestController
public class restController {
    
    private static final Logger logger = LoggerFactory.getLogger(restController.class);
    
    @Inject
    private WineQualityService service;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/restex")
    public List<WineQualityVO> wineQualityList() throws Exception{
 
        logger.info("home");
        
        List<WineQualityVO> wineQualityList = service.selectWineQuality();
        
 
        return wineQualityList;
    }
    
    @RequestMapping(value = "/restex2")
    public List<WineQualityVO> wineQualityList2() throws Exception{
 
        logger.info("home");
        
        List<WineQualityVO> wineQualityList2 = service.selectWineQuality2();
        
 
        return wineQualityList2;
    }
}
