/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCoverJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitAIVideoCoverJobResponse.AIVideoCoverJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAIVideoCoverJobResponseUnmarshaller {

	public static SubmitAIVideoCoverJobResponse unmarshall(SubmitAIVideoCoverJobResponse submitAIVideoCoverJobResponse, UnmarshallerContext context) {
		
		submitAIVideoCoverJobResponse.setRequestId(context.stringValue("SubmitAIVideoCoverJobResponse.RequestId"));

		AIVideoCoverJob aIVideoCoverJob = new AIVideoCoverJob();
		aIVideoCoverJob.setJobId(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.JobId"));
		aIVideoCoverJob.setMediaId(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.MediaId"));
		aIVideoCoverJob.setStatus(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.Status"));
		aIVideoCoverJob.setCode(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.Code"));
		aIVideoCoverJob.setMessage(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.Message"));
		aIVideoCoverJob.setCreationTime(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.CreationTime"));
		aIVideoCoverJob.setData(context.stringValue("SubmitAIVideoCoverJobResponse.AIVideoCoverJob.Data"));
		submitAIVideoCoverJobResponse.setAIVideoCoverJob(aIVideoCoverJob);
	 
	 	return submitAIVideoCoverJobResponse;
	}
}