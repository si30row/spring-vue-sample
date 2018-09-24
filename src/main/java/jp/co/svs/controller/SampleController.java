package jp.co.svs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.svs.entity.SampleEntity;
import jp.co.svs.service.SampleService;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public List<SampleEntity> getSample () {
        return sampleService.getSample();
    }
	
}
