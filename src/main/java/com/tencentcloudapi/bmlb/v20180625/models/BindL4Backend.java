/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindL4Backend  extends AbstractModel{

    /**
    * 待绑定的主机端口，可选值1~65535。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待绑定的主机权重，可选值0~100。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
    */
    @SerializedName("ProbePort")
    @Expose
    private Integer ProbePort;

    /**
     * 获取待绑定的主机端口，可选值1~65535。
     * @return Port 待绑定的主机端口，可选值1~65535。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置待绑定的主机端口，可选值1~65535。
     * @param Port 待绑定的主机端口，可选值1~65535。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     * @return InstanceId 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     * @param InstanceId 待绑定的黑石物理机主机ID、虚拟机IP或者是半托管主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取待绑定的主机权重，可选值0~100。
     * @return Weight 待绑定的主机权重，可选值0~100。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置待绑定的主机权重，可选值0~100。
     * @param Weight 待绑定的主机权重，可选值0~100。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     * @return ProbePort 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     */
    public Integer getProbePort() {
        return this.ProbePort;
    }

    /**
     * 设置自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     * @param ProbePort 自定义探测的主机端口，可选值1~65535。（需要监听器开启自定义健康检查）
     */
    public void setProbePort(Integer ProbePort) {
        this.ProbePort = ProbePort;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "ProbePort", this.ProbePort);

    }
}

