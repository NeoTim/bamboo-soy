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

package com.google.bamboo.soy.icons;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import javax.swing.Icon;

public class SoyIcons {

  public static final Icon CODE_CALL = IconLoader.getIcon("/icons/call.png");
  public static final Icon CODE_INJECT = AllIcons.Nodes.Plugin;
  public static final Icon CODE_NAMESPACE = IconLoader.getIcon("/icons/namespace.png");
  public static final Icon CODE_PARAMETER = AllIcons.Nodes.Parameter;
  public static final Icon CODE_STATE = AllIcons.Nodes.J2eeParameter;
  public static final Icon CODE_TEMPLATE = IconLoader.getIcon("/icons/template.png");
  public static final Icon CODE_VARIABLE = AllIcons.Nodes.Variable;
  public static final Icon FILE = IconLoader.getIcon("/icons/closure-template.png");
}
