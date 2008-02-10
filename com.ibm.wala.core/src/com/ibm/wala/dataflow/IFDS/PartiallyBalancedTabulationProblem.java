/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.dataflow.IFDS;

/**
 * A {@link TabulationProblem} with additional support for computing with partially balanced parentheses.
 * 
 * @author sjfink
 *
 */
public interface PartiallyBalancedTabulationProblem<T,P> extends TabulationProblem<T,P> {
  /**
   * This version should work when the "call" instruction was never reached normally.
   * This applies only when using partially balanced parentheses.  
   * 
   * @param src
   * @param dest
   * @return the flow function for a "return" edge in the supergraph from
   *         src->dest
   */
  public IFlowFunction getReturnFlowFunction(T src, T dest);
  
  /**
   * If "node" is reached by a partially balanced parenthesis, what is the entry node we should use as the root of
   * the {@link PathEdge} to node?
   */
  public T getFakeEntry(T node);
}