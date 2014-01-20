/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.autoscale.models;

/**
* The number of instances that can be used in the scaling action.
*/
public class ScaleCapacity
{
    private String defaultValue;
    
    /**
    * The default number of instances that are available for the scaling action.
    * @return The Default value.
    */
    public String getDefault()
    {
        return this.defaultValue;
    }
    
    /**
    * The default number of instances that are available for the scaling action.
    * @param defaultValue The Default value.
    */
    public void setDefault(final String defaultValue)
    {
        this.defaultValue = defaultValue;
    }
    
    private String maximum;
    
    /**
    * The maximum number of instances that are available for the scaling action.
    * @return The Maximum value.
    */
    public String getMaximum()
    {
        return this.maximum;
    }
    
    /**
    * The maximum number of instances that are available for the scaling action.
    * @param maximumValue The Maximum value.
    */
    public void setMaximum(final String maximumValue)
    {
        this.maximum = maximumValue;
    }
    
    private String minimum;
    
    /**
    * The minimum number of instances that are available for the scaling action.
    * @return The Minimum value.
    */
    public String getMinimum()
    {
        return this.minimum;
    }
    
    /**
    * The minimum number of instances that are available for the scaling action.
    * @param minimumValue The Minimum value.
    */
    public void setMinimum(final String minimumValue)
    {
        this.minimum = minimumValue;
    }
}