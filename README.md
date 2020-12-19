# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-04-schema-generation-em-producao-nao-e-boa-pratica
git add .
git commit -m "Schema generation em produção não é uma boa prática"
git push origin 07-04-schema-generation-em-producao-nao-e-boa-pratica

git checkout master
git merge --no-ff 07-04-schema-generation-em-producao-nao-e-boa-pratica
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```