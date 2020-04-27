package com.devfun.dao;

import java.util.List;

import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.devfun.vo.WineQualityVO;
 
@Repository
public class WineQualityDAOImpl implements WineQualityDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.devfun.mybatis.sql.test";
    
    @Override
    public List<WineQualityVO> selectWineQuality() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectWineQuality");
    }
    
    @Override
    public List<WineQualityVO> selectWineQuality2() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectWineQuality2");
    }
}