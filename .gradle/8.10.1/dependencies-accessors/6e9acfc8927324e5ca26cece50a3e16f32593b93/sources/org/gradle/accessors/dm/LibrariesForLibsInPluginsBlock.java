package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final BstatsLibraryAccessors laccForBstatsLibraryAccessors = new BstatsLibraryAccessors(owner);
    private final CommandLibraryAccessors laccForCommandLibraryAccessors = new CommandLibraryAccessors(owner);
    private final CrateLibraryAccessors laccForCrateLibraryAccessors = new CrateLibraryAccessors(owner);
    private final PaperLibraryAccessors laccForPaperLibraryAccessors = new PaperLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>annotations</b> with <b>org.jetbrains:annotations</b> coordinates and
     * with version <b>26.0.0</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getAnnotations() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("annotations");
    }

    /**
     * Dependency provider for <b>citizens</b> with <b>net.citizensnpcs:citizens-main</b> coordinates and
     * with version <b>2.0.35-SNAPSHOT</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getCitizens() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("citizens");
    }

    /**
     * Dependency provider for <b>colorparser</b> with <b>com.github.milkdrinkers:colorparser</b> coordinates and
     * with version <b>2.0.3</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getColorparser() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("colorparser");
    }

    /**
     * Group of libraries at <b>bstats</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BstatsLibraryAccessors getBstats() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForBstatsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>command</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CommandLibraryAccessors getCommand() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCommandLibraryAccessors;
    }

    /**
     * Group of libraries at <b>crate</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CrateLibraryAccessors getCrate() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCrateLibraryAccessors;
    }

    /**
     * Group of libraries at <b>paper</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public PaperLibraryAccessors getPaper() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForPaperLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BstatsLibraryAccessors extends SubDependencyFactory {

        public BstatsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bukkit</b> with <b>org.bstats:bstats-bukkit</b> coordinates and
         * with version <b>3.1.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBukkit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("bstats.bukkit");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CommandLibraryAccessors extends SubDependencyFactory {

        public CommandLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>dev.jorel:commandapi-bukkit-shade</b> coordinates and
         * with version <b>9.5.3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("command.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CrateLibraryAccessors extends SubDependencyFactory {

        public CrateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>com.github.milkdrinkers:crate-api</b> coordinates and
         * with version reference <b>crate</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crate.api");
        }

        /**
         * Dependency provider for <b>yaml</b> with <b>com.github.milkdrinkers:crate-yaml</b> coordinates and
         * with version reference <b>crate</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getYaml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("crate.yaml");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class PaperLibraryAccessors extends SubDependencyFactory {

        public PaperLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>io.papermc.paper:paper-api</b> coordinates and
         * with version <b>1.21.1-R0.1-SNAPSHOT</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("paper.api");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>crate</b> with value <b>2.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCrate() { return getVersion("crate"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final FoojayPluginAccessors paccForFoojayPluginAccessors = new FoojayPluginAccessors(providers, config);
        private final PluginPluginAccessors paccForPluginPluginAccessors = new PluginPluginAccessors(providers, config);
        private final RunPluginAccessors paccForRunPluginAccessors = new RunPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>shadow</b> with plugin id <b>io.github.goooler.shadow</b> and
         * with version <b>8.1.8</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getShadow() { return createPlugin("shadow"); }

        /**
         * Group of plugins at <b>plugins.foojay</b>
         */
        public FoojayPluginAccessors getFoojay() {
            return paccForFoojayPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.plugin</b>
         */
        public PluginPluginAccessors getPlugin() {
            return paccForPluginPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.run</b>
         */
        public RunPluginAccessors getRun() {
            return paccForRunPluginAccessors;
        }

    }

    public static class FoojayPluginAccessors extends PluginFactory {
        private final FoojayResolverPluginAccessors paccForFoojayResolverPluginAccessors = new FoojayResolverPluginAccessors(providers, config);

        public FoojayPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.foojay.resolver</b>
         */
        public FoojayResolverPluginAccessors getResolver() {
            return paccForFoojayResolverPluginAccessors;
        }

    }

    public static class FoojayResolverPluginAccessors extends PluginFactory {

        public FoojayResolverPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>foojay.resolver.convention</b> with plugin id <b>org.gradle.toolchains.foojay-resolver-convention</b> and
         * with version <b>0.8.0</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getConvention() { return createPlugin("foojay.resolver.convention"); }

    }

    public static class PluginPluginAccessors extends PluginFactory {

        public PluginPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>plugin.yml</b> with plugin id <b>net.minecrell.plugin-yml.bukkit</b> and
         * with version <b>0.6.0</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getYml() { return createPlugin("plugin.yml"); }

    }

    public static class RunPluginAccessors extends PluginFactory {

        public RunPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>run.paper</b> with plugin id <b>xyz.jpenilla.run-paper</b> and
         * with version <b>2.3.1</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getPaper() { return createPlugin("run.paper"); }

    }

}
