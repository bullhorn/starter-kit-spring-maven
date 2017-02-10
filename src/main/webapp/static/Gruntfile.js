module.exports = function(grunt) {
    var mavenProperties = grunt.file.readJSON('maven-properties.json');

    var environmentVariables = mavenProperties.environmentVariables;

    var replacements = [];

    for(var key in environmentVariables) {
        var replacement = {
            pattern: new RegExp("\\$\{"+key+"\}", "g"),
            replacement: environmentVariables[key]
        };

        replacements.push(replacement);
    }

    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        gruntMavenProperties: grunt.file.readJSON('grunt-maven.json'),
        mavenPrepare: {
            options: {
                resources: ['**']
            },
            prepare: {}
        },
        'string-replace': {
            options: {
                replacements: replacements
            },
            build: {
                files: [
                    {
                        expand: true,
                        cwd: 'src',
                        src: [
                            '**/*.es6',
                            '**/*.js',
                            '!lib/**/*.*'
                        ],
                        dest: 'src'
                    },
                    {
                        expand: true,
                        cwd: 'less',
                        src: [
                            '**/*.less',
                            '**/*.css',
                            '!lib/**/*.*'
                        ],
                        dest: 'less'
                    }
                ]
            }
        },
        babel: {
            options: {
                sourceMap: true,
                presets: [
                    'es2015'
                ],
                plugins: [
                    'transform-es2015-modules-amd',
                    'transform-class-properties'
                ]
            },
            files: {
                expand: true,
                cwd: 'src',
                src: '**/*.es6',
                dest: 'javascript',
                ext: '.js'
            }
        },
        less: {
            options: {
                compress: true,
                yuicompress: true
            },
            files:  {
                expand: true,
                cwd: 'less',
                src: '**/*.less',
                dest: 'styles',
                ext: '.min.css',
                extDot: 'first'
            }
        },
        copy: {
            build: {
                files: [
                    {
                        expand: true,
                        cwd: 'src',
                        src: '**/*.js',
                        dest: 'javascript'
                    },
                    {
                        expand: true,
                        cwd: 'less',
                        src: '**/*.css',
                        dest: 'styles'
                    },
                    {
                        expand: true,
                        cwd: 'less',
                        src: 'lib/**/img/*.*',
                        dest: 'styles'
                    }
                ]
            }
        },
        uglify: {
            options: {
                sourceMap: true
            },
            files: {
                expand: true,
                cwd: 'javascript',
                src: [
                    '**/*.js',
                    '!lib/**/*.*'
                ],
                dest: 'javascript',
                ext: '.min.js',
                extDot: 'first'
            }
        },
        mavenDist: {
            options: {
                warName: mavenProperties.warName,
                deliverables: [
                    'javascript/lib/**/*.js',
                    'javascript/**/*.min.js',
                    'javascript/**/*.min.js.map',
                    'styles/**/*.css',
                    'styles/lib/**/img/*.*',
                    'templates/**/*.html',
                    'images/**/*.*'
                ]
            },
            dist: {}
        }
    });

    grunt.loadNpmTasks('grunt-maven');
    grunt.loadNpmTasks('grunt-string-replace');
    grunt.loadNpmTasks('grunt-babel');
    grunt.loadNpmTasks('grunt-contrib-less');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-uglify');

    grunt.registerTask('default', ['mavenPrepare', 'string-replace', 'babel', 'less', 'copy', 'uglify', 'mavenDist']);
};
