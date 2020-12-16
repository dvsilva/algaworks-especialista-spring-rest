# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 05-20-estentendo-jparepository-para-customizar-o-repositorio-base
git add .
git commit -m "Estendendo o JpaRepository para customizar o repositório base"
git push origin 05-20-estentendo-jparepository-para-customizar-o-repositorio-base

git checkout master
git merge --no-ff 05-20-estentendo-jparepository-para-customizar-o-repositorio-base
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