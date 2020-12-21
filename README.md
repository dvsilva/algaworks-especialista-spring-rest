# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 08-07-analisando-impactos-da-refatoracao
git add .
git commit -m "Analisando os impactos da refatoração"
git push origin 08-07-analisando-impactos-da-refatoracao

git checkout master
git merge --no-ff 08-07-analisando-impactos-da-refatoracao
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