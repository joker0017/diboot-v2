package com.diboot.example.service;

import com.diboot.core.entity.Dictionary;
import com.diboot.core.service.BaseService;
import com.diboot.example.vo.DictionaryVO;

/**
 * 数据字典相关Service
 * @author Wangyongliang
 * @version v2.0
 * @date 2019/7/8
 */
public interface DictionaryService extends BaseService<Dictionary> {

    //新增
    boolean createDictionary(DictionaryVO entity);

    //更新
    boolean updateDictionary(DictionaryVO entity);

    //删除
    boolean deleteDictionary(Long id);
}