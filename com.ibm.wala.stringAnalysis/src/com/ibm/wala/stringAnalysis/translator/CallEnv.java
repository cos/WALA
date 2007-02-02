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
/**
 * 
 */
package com.ibm.wala.stringAnalysis.translator;

import java.util.Set;

import com.ibm.wala.automaton.grammar.string.IProductionRule;
import com.ibm.wala.stringAnalysis.translator.repository.ITranslator;

public class CallEnv {
  final public Set terminals;
  final public IProductionRule invokeRule;
  final public ITranslator translator;

  public CallEnv(IProductionRule invokeRule, ITranslator translator, Set terminals) {
    this.invokeRule = invokeRule;
    this.terminals = terminals;
    this.translator = translator;
  }
}