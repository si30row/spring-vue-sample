package jp.co.svs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.svs.entity.SampleEntity;
import jp.co.svs.repository.SampleRepository;

@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    public List<SampleEntity> getSample () {
        return sampleRepository.selectAll();
    }

}
