/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.springframework.security.boot.pac4j;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TODO
 * @author 		： <a href="https://github.com/hiwepy">wandl</a>
 */
@Getter
@Setter
@ToString
public class Pac4jRedirectionProperties {

	/** Header Pattern */
	private Map<String, String> headerPattern = new HashMap<String, String>();
	
	/** Parameter Pattern */
	private Map<String, String> paramPattern = new HashMap<String, String>();
	
	/** Path Pattern */
	private String pathPattern;

	private String redirectUrl; 

	/**
	 * Define on which error URL the user will be redirected in case of an exception.
	 */
	private String errorUrl;

	private String targetUrlParameter = "target";
	
	private String defaultTargetUrl = "/";
	
	private boolean alwaysUseDefaultTargetUrl = false;
	
	private boolean useReferer = false;
	
}
