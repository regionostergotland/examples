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

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.marand.maf.core.hibernate.entity.AbstractEffectiveEntity;
import com.marand.thinkmed.medications.model.Medication;
import com.marand.thinkmed.medications.model.MedicationIndication;
import com.marand.thinkmed.medications.model.MedicationIndicationLink;
import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @author Mitja Lapajne
 */
@Entity
@Table(indexes = {
    @Index(name = "xfMedicationIndicationLinkInd", columnList = "indication_id"),
    @Index(name = "xfMedicationIndicationLinkMed", columnList = "medication_id")})
public class MedicationIndicationLinkImpl extends AbstractEffectiveEntity implements MedicationIndicationLink
{
  private MedicationIndication indication;
  private Medication medication;

  @Override
  @ManyToOne(targetEntity = MedicationIndicationImpl.class, fetch = FetchType.LAZY, optional = false)
  public MedicationIndication getIndication()
  {
    return indication;
  }

  @Override
  public void setIndication(final MedicationIndication indication)
  {
    this.indication = indication;
  }

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
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);

    tsb.append("indication", indication)
        .append("medication", medication)
    ;
  }
}
