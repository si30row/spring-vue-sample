package jp.co.svs.repository;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.svs.entity.SampleEntity;

@ConfigAutowireable
@Dao
public interface SampleRepository {

    @Select
    public List<SampleEntity> selectAll();

    @Select
    public List<SampleEntity> selectAll2();
    
    @Select
    public List<SampleEntity> selectAll3();
    
}
