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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetInvokeTxResponse  extends AbstractModel{

    /**
    * 状态码
    */
    @SerializedName("TxValidationCode")
    @Expose
    private Integer TxValidationCode;

    /**
    * 消息
    */
    @SerializedName("TxValidationMsg")
    @Expose
    private String TxValidationMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取状态码
     * @return TxValidationCode 状态码
     */
    public Integer getTxValidationCode() {
        return this.TxValidationCode;
    }

    /**
     * 设置状态码
     * @param TxValidationCode 状态码
     */
    public void setTxValidationCode(Integer TxValidationCode) {
        this.TxValidationCode = TxValidationCode;
    }

    /**
     * 获取消息
     * @return TxValidationMsg 消息
     */
    public String getTxValidationMsg() {
        return this.TxValidationMsg;
    }

    /**
     * 设置消息
     * @param TxValidationMsg 消息
     */
    public void setTxValidationMsg(String TxValidationMsg) {
        this.TxValidationMsg = TxValidationMsg;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxValidationCode", this.TxValidationCode);
        this.setParamSimple(map, prefix + "TxValidationMsg", this.TxValidationMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

