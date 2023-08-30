package ink.akira.dubbodemo.api.service;

import ink.akira.dubbodemo.api.req.DemoReq;
import ink.akira.dubbodemo.api.resp.DemoResp;

public interface DemoService {
    DemoResp query(DemoReq req);
}
