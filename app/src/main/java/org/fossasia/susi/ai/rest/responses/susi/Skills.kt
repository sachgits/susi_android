package org.fossasia.susi.ai.rest.responses.susi

import com.google.gson.annotations.SerializedName

/**
 *
 * Created by cc15 on 16/8/17.
 */
data class Skills (
    @SerializedName("aboutsusi")
    val skillData: SkillData? = null
)