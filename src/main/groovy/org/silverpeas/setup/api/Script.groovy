/*
  Copyright (C) 2000 - 2022 Silverpeas

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU Affero General Public License as
  published by the Free Software Foundation, either version 3 of the
  License, or (at your option) any later version.

  As a special exception to the terms and conditions of version 3.0 of
  the GPL, you may redistribute this Program in connection with Free/Libre
  Open Source Software ("FLOSS") applications as described in Silverpeas's
  FLOSS exception.  You should have received a copy of the text describing
  the FLOSS exception, and it is also available here:
  "https://www.silverpeas.org/docs/core/legal/floss_exception.html"

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Affero General Public License for more details.

  You should have received a copy of the GNU Affero General Public License
  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.silverpeas.setup.api

/**
 * A script to be executed by a Gradle task.
 * @author mmoquillon
 */
interface Script {

  /**
   * Runs this script with the specified arguments.
   * @param args the arguments to pass to the script. It is a Map of variables in
   * which the key is the variable name and the value its value.
   * @throws RuntimeException if an error occurs during the execution of the script.
   */
  void run(Map<String, ?> args) throws RuntimeException

  /**
   * Uses the specified logger to trace the execution of this script.
   * @param logger a logger.
   * @return itself.
   */
  Script useLogger(FileLogger logger)

  /**
   * Uses the specified settings to parametrize the execution of this script.
   * @param settings a collection of key-value pairs defining all the settings.
   * @return itself.
   */
  Script useSettings(Map<String, String> settings)
}
