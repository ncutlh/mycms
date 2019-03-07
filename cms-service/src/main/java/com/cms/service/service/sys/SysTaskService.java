package com.cms.service.service.sys;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysTask;
public interface  SysTaskService {


    int insert(SysTask pojo);

    int insertList(List< SysTask> pojos);

    List<SysTask> select(SysTask pojo);

    int update(SysTask pojo);

}
