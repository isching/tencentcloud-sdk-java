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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeDetailInfoRequest  extends AbstractModel{

    /**
    * 起始时间，北京时间，
格式：yyyymmdd。
注意：当前只支持查询近30天内某天的详细数据。
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * 推流域名。
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 页数，默认1，
不超过100页。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数，默认20，
范围：[10,1000]。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 获取起始时间，北京时间，
格式：yyyymmdd。
注意：当前只支持查询近30天内某天的详细数据。
     * @return DayTime 起始时间，北京时间，
格式：yyyymmdd。
注意：当前只支持查询近30天内某天的详细数据。
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * 设置起始时间，北京时间，
格式：yyyymmdd。
注意：当前只支持查询近30天内某天的详细数据。
     * @param DayTime 起始时间，北京时间，
格式：yyyymmdd。
注意：当前只支持查询近30天内某天的详细数据。
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * 获取推流域名。
     * @return PushDomain 推流域名。
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * 设置推流域名。
     * @param PushDomain 推流域名。
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取页数，默认1，
不超过100页。
     * @return PageNum 页数，默认1，
不超过100页。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页数，默认1，
不超过100页。
     * @param PageNum 页数，默认1，
不超过100页。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页个数，默认20，
范围：[10,1000]。
     * @return PageSize 每页个数，默认20，
范围：[10,1000]。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页个数，默认20，
范围：[10,1000]。
     * @param PageSize 每页个数，默认20，
范围：[10,1000]。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

