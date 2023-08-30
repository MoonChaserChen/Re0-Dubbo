package ink.akira.dubbodemo.provider.service.dubbo;

import ink.akira.dubbodemo.api.req.DemoReq;
import ink.akira.dubbodemo.api.resp.DemoResp;
import ink.akira.dubbodemo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public DemoResp query(DemoReq req) {
        DemoResp resp = new DemoResp();
        resp.setId(req.getId());
        resp.setName("Tom");
        resp.setAge(18);
        return resp;
    }
}
