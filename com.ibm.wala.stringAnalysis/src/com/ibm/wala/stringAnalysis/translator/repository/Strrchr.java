/******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/
package com.ibm.wala.stringAnalysis.translator.repository;

import com.ibm.wala.automaton.grammar.string.SimpleGrammar;

public class Strrchr extends Strchr {

  private Strrev strrev = new Strrev();
  
  public Strrchr(int needle) {
    super(needle);
  }

  public Strrchr(int target, int needle) {
    super(target, needle);
  }

  public SimpleGrammar translate(SimpleGrammar sg) {
    sg = strrev.prepare(translator, funcName, recv, params, rule, sg,
      varFactory);
    sg = super.translate(sg);
    sg = strrev.prepare(translator, funcName, recv, params, rule, sg,
      varFactory);
    return sg;
  }
}
