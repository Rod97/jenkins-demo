pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('gameshop-job'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/Rod97/newGameshop.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
