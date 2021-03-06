/*
 * Copyright (c) 2010-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of Think!Med Clinical Medication Management.
 *
 * Think!Med Clinical Medication Management is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Think!Med Clinical Medication Management is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Think!Med Clinical Medication Management.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.marand.thinkmed.medications.dto.task;

import com.marand.thinkmed.api.core.data.object.DataTransferObject;
import com.marand.thinkmed.medications.connector.data.object.PatientDisplayDto;
import com.marand.thinkmed.medications.TaskTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Klavdij Lapajne
 */

public class PatientTaskDto extends DataTransferObject
{
  private String id;
  private PatientDisplayDto patientDisplayDto;
  private TaskTypeEnum taskType;
  private String careProviderName;

  public String getId()
  {
    return id;
  }

  public void setId(final String id)
  {
    this.id = id;
  }

  public PatientDisplayDto getPatientDisplayDto()
  {
    return patientDisplayDto;
  }

  public void setPatientDisplayDto(final PatientDisplayDto patientDisplayDto)
  {
    this.patientDisplayDto = patientDisplayDto;
  }

  public TaskTypeEnum getTaskType()
  {
    return taskType;
  }

  public void setTaskType(final TaskTypeEnum taskType)
  {
    this.taskType = taskType;
  }

  public String getCareProviderName()
  {
    return careProviderName;
  }

  public void setCareProviderName(final String careProviderName)
  {
    this.careProviderName = careProviderName;
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    tsb
        .append("id", id)
        .append("patientDisplayDto", patientDisplayDto)
        .append("taskType", taskType)
        .append("careProviderName", careProviderName)
    ;
  }
}
