// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.bamboo.soy.elements.impl;

import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.parser.SoyVariableDefinitionIdentifier;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.LocalSearchScope;
import com.intellij.psi.search.SearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class VariableDefinitionMixin extends IdentifierDefinitionMixin
    implements SoyVariableDefinitionIdentifier {

  public VariableDefinitionMixin(@NotNull ASTNode node) {
    super(node);
  }

  @Nullable
  @Override
  public PsiElement getNameIdentifier() {
    return getIdentifierWord();
  }

  @NotNull
  @Override
  public SearchScope getUseScope() {
    PsiElement scopeElement = Scope.getFirstScopeParent(this);
    return scopeElement == null ? super.getUseScope() : new LocalSearchScope(scopeElement);
  }

  @Override
  public ItemPresentation getPresentation() {
    return SoyPsiElementPresentationFactory.getItemPresentation(this);
  }
}
