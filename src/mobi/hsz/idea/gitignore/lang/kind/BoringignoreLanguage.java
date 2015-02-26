/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.gitignore.lang.kind;

import mobi.hsz.idea.gitignore.IgnoreBundle;
import mobi.hsz.idea.gitignore.file.type.IgnoreFileType;
import mobi.hsz.idea.gitignore.file.type.kind.BoringignoreFileType;
import mobi.hsz.idea.gitignore.lang.IgnoreLanguage;
import mobi.hsz.idea.gitignore.util.Icons;
import org.jetbrains.annotations.NotNull;

/**
 * Boringignore {@link com.intellij.lang.Language} definition.
 *
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.10
 */
public class BoringignoreLanguage extends IgnoreLanguage {
    /** The {@link BoringignoreLanguage} instance. */
    public static final BoringignoreLanguage INSTANCE = new BoringignoreLanguage();

    /** {@link IgnoreLanguage} is a non-instantiable static class. */
    private BoringignoreLanguage() {
        super("Boringignore", "boringignore", Icons.BORINGIGNORE);
    }

    /** Language file type. */
    @Override
    public IgnoreFileType getFileType() {
        return BoringignoreFileType.INSTANCE;
    }

    /**
     * Returns default language syntax.
     *
     * @return default syntax
     */
    @NotNull
    @Override
    public IgnoreBundle.Syntax getDefaultSyntax() {
        return IgnoreBundle.Syntax.REGEXP;
    }
}