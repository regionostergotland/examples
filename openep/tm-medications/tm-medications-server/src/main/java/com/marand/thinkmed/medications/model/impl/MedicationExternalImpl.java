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

package com.marand.thinkmed.medications.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.marand.maf.core.hibernate.entity.AbstractEffectiveEntity;
import com.marand.thinkmed.medications.MedicationExternalSystemType;
import com.marand.thinkmed.medications.model.Medication;
import com.marand.thinkmed.medications.model.MedicationExternal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @author Mitja Lapajne
 */
@Entity
@Table(indexes = {
    @Index(name = "xfMedicationExternalMed", columnList = "medication_id"),
    @Index(name = "xpMedicationExternalExtId", columnList = "external_id"),
    @Index(name = "xpMedicationExternalExtSys", columnList = "external_system"),
    @Index(name = "xpMedicationExternalSysTyp", columnList = "external_system_type")})
public class MedicationExternalImpl extends AbstractEffectiveEntity implements MedicationExternal
{
  private Medication medication;
  private String externalId;
  private String externalSystem;
  private MedicationExternalSystemType externalSystemType;

  @Override
  @ManyToOne(targetEntity = MedicationImpl.class, fetch = FetchType.LAZY, optional = false)
  public Medication getMedication()
  {
    return medication;
  }

  @Override
  public void setMedication(final Medication medication)
  {
    this.medication = medication;
  }

  @Override
  @Column(nullable = false)
  public String getExternalId()
  {
    return externalId;
  }

  @Override
  public void setExternalId(final String externalId)
  {
    this.externalId = externalId;
  }

  @Override
  @Column(nullable = false)
  public String getExternalSystem()
  {
    return externalSystem;
  }

  @Override
  public void setExternalSystem(final String externalSystem)
  {
    this.externalSystem = externalSystem;
  }

  @Override
  @Enumerated(EnumType.STRING)
  public MedicationExternalSystemType getExternalSystemType()
  {
    return externalSystemType;
  }

  @Override
  public void setExternalSystemType(final MedicationExternalSystemType externalSystemType)
  {
    this.externalSystemType = externalSystemType;
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);

    tsb.append("medication", medication)
        .append("externalId", externalId)
        .append("externalSystem", externalSystem)
    ;
  }
}
