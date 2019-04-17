package com.mola.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * bean需要调用Spring自身工具时，使用Aware，让Spring意识到bean的存在
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    //bean的名称
    private String beanName;
    //加载文件时需要调用的spring工具
    private ResourceLoader loader;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public ResourceLoader getLoader() {
        return loader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader=resourceLoader;
    }

    public void outputResult(){
        try {
            Resource resource = loader.getResource("classpath:com/mola/aware/test.txt");
            System.out.println(IOUtils.toString(resource.getInputStream()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
