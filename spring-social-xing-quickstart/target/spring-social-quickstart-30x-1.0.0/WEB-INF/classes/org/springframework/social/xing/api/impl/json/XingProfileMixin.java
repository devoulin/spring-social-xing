/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.xing.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.xing.api.BirthDate;
import org.springframework.social.xing.api.BusinessAddress;
import org.springframework.social.xing.api.PhotoUrls;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class XingProfileMixin {

    @JsonCreator
    XingProfileMixin(
            @JsonProperty("id") String id,
            @JsonProperty("first_name") String firstName,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("permalink") String permalink,
            @JsonProperty("active_email") String activeEmail,
            @JsonProperty("display_name") String displayName
    ) {
    }

    @JsonProperty("birth_date")
    private BirthDate birthDate;
    @JsonProperty("photo_urls")
    private PhotoUrls photoUrls;
    @JsonProperty("interests")
    private String interests;
    @JsonProperty("wants")
    private String wants;
    @JsonProperty("organisation_member")
    private String organisationMember;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("page_name")
    private String pageName;
    @JsonProperty("business_address")
    private BusinessAddress businessAddress;
    @JsonProperty("haves")
    private String haves;
}
